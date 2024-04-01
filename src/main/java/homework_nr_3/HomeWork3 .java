package homework_nr_3;

class HomeWork3 {
    public static void main(String[] args) {
        String decorator = "=".repeat(100);
        String decorator1 = "=".repeat(40);

        System.out.println(decorator+"\n"+decorator1+"    CASE PROBLEM    "+decorator1+"\n"+ decorator);

        int manth = 3;
        switch (manth) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;

        }
        System.out.println(decorator+"\n"+decorator1+"   DIVIDE TO FIVE   "+decorator1+"\n"+ decorator);
        int rez = 0;
        for (int i = 100; i <= 1000; i++) {
            rez = i % 5;
            if (rez == 0) {
                System.out.println(i);
            }

        }
        System.out.println(decorator+"\n"+decorator1+"        SUM        "+decorator1+"\n"+ decorator);
        int nam = 1;
        int denam = 3;
        double sum = 0;
        while (denam <= 99) {
            System.out.println(nam + "/" + denam);
            sum += (double) nam / denam;
            nam = nam + 2;
            denam = denam + 2;
        }
        System.out.println(sum);

    }
}
