public class CircularBuffer {

    private final int bufferSize;
    private final String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this(10);
    }

    public CircularBuffer(int bufferSize) {
        this.bufferSize = bufferSize;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String s) {
        writePointer %= bufferSize;
        this.buffer[writePointer++] = s;
    }

    public boolean isFull() {
        return readPointer - writePointer == 1 || writePointer - readPointer == bufferSize;
    }

    public String readData() {
        readPointer %= bufferSize;
        return this.buffer[readPointer++];
    }
}
