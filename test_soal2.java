public class test_soal2 {
    public static void main(String[] args) {
        Object [] data = new Object[] {1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};

//        System.out.println("index ke 0 adalah " + (Object)data[0].getClass().getSimpleName() + " dengan data " + data[0]);
//        System.out.println("index ke 1 adalah " + (Object)data[1].getClass().getSimpleName() + " dengan data " + data[1]);
//        System.out.println("index ke 2 adalah " + (Object)data[2].getClass().getSimpleName() + " dengan data " + data[2]);
//        System.out.println("index ke 3 adalah " + (Object)data[3].getClass().getSimpleName() + " dengan data " + data[3]);
//        System.out.println("index ke 4 adalah " + (Object)data[4].getClass().getSimpleName() + " dengan data " + data[4]);
//        System.out.println("index ke 5 adalah " + (Object)data[5].getClass().getSimpleName() + " dengan data " + data[5]);
//        System.out.println("index ke 6 adalah " + (Object)data[6].getClass().getSimpleName() + " dengan data " + data[6]);
//        System.out.println("index ke 7 adalah " + (Object)data[7].getClass().getSimpleName() + " dengan data " + data[7]);
//        System.out.println("index ke 8 adalah " + (Object)data[8].getClass().getSimpleName() + " dengan data " + data[8]);

        for(int i = 0; i < data.length; i++) {
            System.out.println("index ke " + i + " adalah " + (Object)data[i].getClass().getSimpleName() + " dengan data " + data[i]);
        }

        }
}
