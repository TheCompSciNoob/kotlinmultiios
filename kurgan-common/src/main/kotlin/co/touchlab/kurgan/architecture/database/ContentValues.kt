package co.touchlab.kurgan.architecture.database

class ContentValues{

 /** Holds the actual values */
    val mValues: HashMap<String, Any?>

    /**
     * Creates an empty set of values using the default initial size
     */
    constructor() {
        // Choosing a default size of 8 based on analysis of typical
        // consumption by applications.
        mValues = HashMap(8)
    }

    /**
     * Creates an empty set of values using the given initial size
     *
     * @param size the initial size of the set of values
     */
    constructor(size:Int) {
        mValues = HashMap(size)
    }

    /**
     * Creates a set of values copied from the given set
     *
     * @param from the values to copy
     */
    constructor(from:ContentValues) {
        mValues = HashMap(from.mValues)
    }

    /**
     * Creates a set of values copied from the given HashMap. This is used
     * by the Parcel unmarshalling code.
     *
     * @param values the values to start with
     * {@hide}
     */
    constructor(values:HashMap<String, Any?>) {
        mValues = values
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ContentValues

        return mValues.equals(other.mValues)
    }

    override fun hashCode(): Int = mValues.hashCode()

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:String) {
        mValues.put(key, value)
    }

    /**
     * Adds all values from the passed in ContentValues.
     *
     * @param other the ContentValues from which to copy
     */
    fun putAll(other:ContentValues ) = mValues.putAll(other.mValues)

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Byte) {
        mValues.put(key, value)
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Short) {
        mValues.put(key, value)
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Int) {
        mValues.put(key, value);
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Long) {
        mValues.put(key, value);
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Float) {
        mValues.put(key, value);
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Double) {
        mValues.put(key, value);
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:Boolean) {
        mValues.put(key, value);
    }

    /**
     * Adds a value to the set.
     *
     * @param key the name of the value to put
     * @param value the data for the value to put
     */
    fun put(key:String, value:ByteArray) {
        mValues.put(key, value);
    }

    /**
     * Adds a null value to the set.
     *
     * @param key the name of the value to make null
     */
    fun putNull(key:String) {
        mValues.put(key, null)
    }

    /**
     * Returns the number of values.
     *
     * @return the number of values
     */
    fun size():Int = mValues.size

    /**
     * Remove a single value.
     *
     * @param key the name of the value to remove
     */
    fun remove(key:String) {
        mValues.remove(key)
    }

    /**
     * Removes all values.
     */
    fun clear() = mValues.clear()

    /**
     * Returns true if this object has the named value.
     *
     * @param key the value to check for
     * @return {@code true} if the value is present, {@code false} otherwise
     */
    fun containsKey(key:String):Boolean = mValues.containsKey(key)

    /**
     * Gets a value. Valid value types are {@link String}, {@link Boolean}, and
     * {@link Number} implementations.
     *
     * @param key the value to get
     * @return the data for the value
     */
    fun get(key:String):Any? = mValues.get(key)

    /**
     * Gets a value and converts it to a String.
     *
     * @param key the value to get
     * @return the String for the value
     */
    fun getAsString(key:String):String? = mValues.get(key)?.toString()

    /**
     * Gets a value that is a byte array. Note that this method will not convert
     * any other types to byte arrays.
     *
     * @param key the value to get
     * @return the byte[] value, or null is the value is missing or not a byte[]
     */
    fun getAsByteArray(key:String):ByteArray? = mValues[key] as? ByteArray

    fun keySet():MutableSet<String> = mValues.keys

}