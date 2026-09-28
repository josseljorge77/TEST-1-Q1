//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main( String[] args) {
    String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    int[][] sales= {{1000, 2000, 3000} , {2000,3000, 4000}, {1500, 1100, 1200}};
    String[] consoles = {"PS5", "XBOX", "SWITCH"};

    int[] totals = new int[cities.length];

    for (int c = 0; c < cities.length; c++) {
        for (int k = 0; k < consoles.length; k++) {
            totals[c] += sales[c][k];
        }
    }
int maxIndex = 0;
    for ( int c = 1; c < totals.length; c++) {
        if (totals[c] > totals[maxIndex]) {
            maxIndex = c;
        }
    }

    String line ="-".repeat(60);
            System.out.println(line);
            System.out.println("GAMING CONSOLE REPORT");
            System.out.println(line);

    System.out.printf("%18s%-12s%-12s%-12s%n", "", consoles[0], consoles[1], consoles[2]);
        for (int c = 0; c < cities.length; c++){

            System.out.printf("%-18s%-12d%-12d%-12d%n", cities[c], sales[c][0], sales[c][1], sales[c][2]);
        }

        System.out.println((line));
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);
        for (int c = 0; c < cities.length; c++) {
            System.out.printf("%-18s%d%n", cities[c], totals[c]);
        }

        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println(line);

}

