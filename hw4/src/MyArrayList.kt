class MyArrayList<T> {
    private var buffer = arrayOfNulls<Any>(8);
    private var size : Int = 0;

    fun add(element: T){
        if ( size == buffer.size ) {
            buffer = buffer.copyOf(2*buffer.size)
        }
        buffer[size++] = element
    }
    
    fun insert( id: Int, element: T) {
        if (id < 0 || id > size) {
            throw IndexOutOfBoundsException()
        }
        if ( size == buffer.size ) {
            buffer = buffer.copyOf(2*buffer.size)
        }
        for (i in size downTo id + 1) {
            buffer[i] = buffer[i - 1]
        }
        buffer[id] = element
        size++
    }

    fun delete(id: Int) {
        if (id < 0 || id > size) {
            throw IndexOutOfBoundsException()
        }
        for (i in id until size-1) {
            buffer[i] = buffer[i + 1]
        }
        buffer[size-1] = null
        size--;
    }
}