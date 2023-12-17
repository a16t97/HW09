public class LandTrans {
        private String name;
        private int capacity;
        private int yearEnding;
        private boolean isAvailable;

        public LandTrans(String name, int capacity, int yearEnding, boolean isAvailable) {
            this.name = name;
            this.capacity = capacity;
            this.yearEnding = yearEnding;
            this.isAvailable = isAvailable;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getYearEnding() {
            return yearEnding;
        }

        public void setYearEnding(int yearEnding) {
            this.yearEnding = yearEnding;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        @Override
        public String toString() {
            return "LandTrans{" +
                    ", name='" + name + '\'' +
                    ", capacity=" + capacity +
                    ", yearEnding=" + yearEnding +
                    ", isAvailable=" + isAvailable +
                    '}';
        }
    }

