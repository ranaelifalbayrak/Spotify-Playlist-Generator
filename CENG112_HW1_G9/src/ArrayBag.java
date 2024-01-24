
public class ArrayBag<T> implements BagInterface<T>{
	
	private T[] bag;
	private static int DEFAULT_CAPACITY = 25;
	private int numberOfEntries ;

	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayBag(int capacity) {
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[]) new Object[capacity];
		bag = tempBag; 
		numberOfEntries = 0;
	}

	@Override
	public int getCurrentSize() {
		return numberOfEntries;
	}
	@Override
	public boolean isArrayFull() {
		return numberOfEntries >= bag.length;
	}
	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}
	@Override
	public boolean add(T newEntry) {
	    boolean result = true;
	    if (isArrayFull()) {
	    	result = false;
	    }
	    else {
	    	bag[numberOfEntries] = newEntry;
	    	numberOfEntries++;
	    }
		return result;
	}
	@Override
	public T remove() {
		T result =null;
		if(numberOfEntries>0) {
			result = bag[numberOfEntries-1];
			bag[numberOfEntries-1]=null;
			numberOfEntries--;
		}
		return result;
	}
	@Override
	public boolean remove(T anEntry) {
		for (int i = 0; i<this.numberOfEntries;i++) {
			if (this.bag[i].equals(anEntry)) {
                // Shift the remaining items left by one.
                for (int j = i; j < this.numberOfEntries - 1; j++) {
                    this.bag[j] = this.bag[j + 1];
                }
                this.bag[this.numberOfEntries - 1] = null;
                
                this.numberOfEntries--;
                return true;
            }
        }
        
        return false;  // item not found
    }
		
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfEntries];
		for(int index = 0; index < numberOfEntries; index++) {
			result[index] = bag[index];
		}
		return result;
	}
		
	}
	
	
	
	

