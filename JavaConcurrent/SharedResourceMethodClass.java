package JavaConcurrent;

public class SharedResourceMethodClass {
        private int count = 0;
    
        public synchronized void increment() {
            // The entire method is synchronized, ensuring atomicity
            count++;
        }
    
        public int getCount() {
            return count;
        }
}
