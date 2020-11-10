int[][] rainMatrix = new int[5][5]; //matrix dimensions (side x side)

        for (int i = 0; i < rainMatrix.length; i++) {
            for (int j = 0; j < 5; j++) {

                int columnIndex = new Random().nextInt(4) + 1;
                rainMatrix[i][columnIndex] = 1;
                //keep the rain drop to the ground ??

            }
        }
