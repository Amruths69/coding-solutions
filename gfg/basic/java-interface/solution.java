class testClass implements in1 {
    public void display(int k) {
        //daily-dump

        int n = 0;

        for (int i = 2; i <= k; i++) {
            int c = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    c++;

                    if (j != i / j) {
                        c++;
                    }
                }
            }

            if (c == 2) {
                n++;
            }
        }

        System.out.println(n);
    }
}