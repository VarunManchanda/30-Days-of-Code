    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
          return new int[0];
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
          int[] a = {1,2,3};
            return a;
        }

        public static int get_expected_result() {
            // complete this function
          return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
          int a [] = {1,2,1};
            return a;
        }

        public static int get_expected_result() {
            // complete this function
          return 0;
        }
    }
