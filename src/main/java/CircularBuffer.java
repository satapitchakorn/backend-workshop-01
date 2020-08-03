public class CircularBuffer {

    private int bufferSize = 10;
    private String[] buffer = new String[bufferSize];
    private int readPointer = 0;
    private int writePointer = 0;

    public boolean isEmpty() {
        int count = 0;
        for (String str : this.buffer) {
            if (str == null)
                continue;

            if (!str.isEmpty()) {
                count++;
            }
        }
        return count == 0;
    }

    public void writeData(String s) {
        this.buffer[writePointer] = s;
        writePointer++;
    }

    public boolean isFUll() {
        int count = 0;
        for (String str : this.buffer) {
            if (str == null)
                continue;
            if (!str.isEmpty()) {
                count++;
            }
        }
        return count == bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
