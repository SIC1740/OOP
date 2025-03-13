import java.util.*;

class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    // Dùng thêm biến index để giữ thứ tự nhập (nếu muốn xử lý sắp xếp thủ công)
    private int inputIndex;

    public Trainer(String name, int inputIndex) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
        this.inputIndex = inputIndex;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getInputIndex() {
        return inputIndex;
    }
}

public class COLLECTION005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sử dụng LinkedHashMap để vừa truy cập nhanh theo key,
        // vừa giữ được thứ tự insert (TrainerName).
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        int trainerCounter = 0; // đếm thứ tự nhập Trainer

        // Đọc dòng cho đến khi gặp "Tournament"
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equals("Tournament")) {
                break;
            }

            // Ví dụ: "Tracey Bulbasaur Electricity 73"
            String[] parts = line.split("\\s+");
            if (parts.length != 4) {
                // Xử lý trường hợp dòng không hợp lệ, tùy yêu cầu
                continue;
            }
            String trainerName = parts[0];
            String pokemonName = parts[1];
            String pokemonElement = parts[2];
            int pokemonHealth = Integer.parseInt(parts[3]);

            // Kiểm tra Trainer có tồn tại chưa
            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName, trainerCounter++));
            }
            // Thêm Pokemon vào Trainer
            Trainer currentTrainer = trainers.get(trainerName);
            currentTrainer.getPokemons().add(new Pokemon(pokemonName, pokemonElement, pokemonHealth));
        }

        // Đọc các lệnh "Fire", "Water", "Electricity" cho đến khi gặp "End"
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equals("End")) {
                break;
            }

            // line sẽ là 1 trong "Fire", "Water", "Electricity"
            String elementCheck = line;

            // Với mỗi Trainer, kiểm tra xem có Pokemon có element này không
            for (Trainer trainer : trainers.values()) {
                boolean hasElement = false;
                for (Pokemon p : trainer.getPokemons()) {
                    if (p.getElement().equals(elementCheck)) {
                        hasElement = true;
                        break;
                    }
                }

                if (hasElement) {
                    // Cộng 1 huy hiệu
                    trainer.setNumberOfBadges(trainer.getNumberOfBadges() + 1);
                } else {
                    // Tất cả Pokemon bị trừ 10 máu, nếu <= 0 thì xóa
                    List<Pokemon> pokemons = trainer.getPokemons();
                    Iterator<Pokemon> it = pokemons.iterator();
                    while (it.hasNext()) {
                        Pokemon p = it.next();
                        p.setHealth(p.getHealth() - 10);
                        if (p.getHealth() <= 0) {
                            it.remove();
                        }
                    }
                }
            }
        }

        // Sau khi kết thúc, ta in kết quả:
        // Sắp xếp Trainer theo số huy hiệu giảm dần.
        // Nếu bằng nhau, giữ nguyên thứ tự xuất hiện ban đầu (tính ổn định).
        // Java's Collections.sort với lambda sẽ dùng TimSort (ổn định),
        // nên ta chỉ cần so sánh numberOfBadges giảm dần.
        List<Trainer> sortedTrainers = new ArrayList<>(trainers.values());
        sortedTrainers.sort((t1, t2) -> Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges()));

        // In kết quả theo format: "{TrainerName} {Badges} {NumberOfPokemons}"
        for (Trainer trainer : sortedTrainers) {
            System.out.printf("%s %d %d%n",
                    trainer.getName(),
                    trainer.getNumberOfBadges(),
                    trainer.getPokemons().size());
        }

        sc.close();
    }
}
