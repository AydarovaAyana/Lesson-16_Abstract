package animals;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

        @Override
        public String toString () {
            return "Farm{" +
                    "address='" + address + '\'' +
                    ", ownerName='" + ownerName + '\'' +
                    ", cows=\n" + Arrays.toString(cows) +
                    ", sheep=\n" + Arrays.toString(sheep) +
                    ", horses=\n" + Arrays.toString(horses) +
                    '}';
        }
    }


