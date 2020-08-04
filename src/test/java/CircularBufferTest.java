import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_new_buffer_should_empty() {
        boolean isEmpty = cb.isEmpty();
        assertTrue("Buffer is not empty.", isEmpty);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + 1);
        }
        assertTrue("Buffer is not full.", cb.isFull());
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void read_and_write_circular_buffer_2_rounds_should_empty() {
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals("A" + i, cb.readData());
        }
        for (int i = 0; i < 10; i++) {
            cb.writeData("B" + i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals("B" + i, cb.readData());
        }
        boolean result = cb.isEmpty();
        assertTrue("Buffer in not empty.", result);
    }

    @Test
    public void read_before_write_should_null() {
        assertNull(cb.readData());
    }

    @Test
    public void After_read_all_data_should_empty() {
        cb.writeData("A");
        cb.readData();
        assertTrue(cb.isEmpty());
    }
}