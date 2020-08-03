# backend-workshop-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
* TC01: Create new buffer should empty.
* TC02: Create new buffer with default size should 10.
* TC03: Write A to buffer should read A.
* TC04: Read and write buffer 2 rounds should empty.
* TC05: Read before write should null. 
* TC06: After read all data should empty.
