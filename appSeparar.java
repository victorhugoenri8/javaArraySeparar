package arraySepararMayor;

public class appSeparar {
    public static void main(String[] args) {
        int num[] = { 14, 23, 55, 10, 105, 66, 200, 64, 33, 22, 99, 110 };
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < num.length - 1; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if ((num[i] > num[j]) && (num[i] > mayor)) {

                    mayor = num[i];

                } else {
                    if (num[j] > mayor) {
                        mayor = num[j];
                    }

                }
                ;

            }
        }
        ////////////////////////////////////////////////////////
        menor = mayor + 1;

        for (int i = 0; i < num.length - 1; i++) {

            for (int j = i + 1; j < num.length; j++) {

                //// menor
                if ((num[i] < num[j]) && (num[i] < menor)) {

                    menor = num[i];
                } else {
                    if (num[j] < menor) {
                        menor = num[j];
                    }
                }
                ;
            }
        }
        System.out.println("mayor " + mayor);
        System.out.println("menor " + menor);

    }
}
