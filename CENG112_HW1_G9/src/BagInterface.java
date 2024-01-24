
public interface BagInterface<T> {
	
	public int getCurrentSize();
	
	// returns the current number of entries in the bag
	
	public boolean isArrayFull();
	
	// returns true if the bag is full, false if not.
	
	public boolean isEmpty();
	
	// returns True if the bag is empty, false if not.
	
	public boolean add(T newEntry);
	
	// adds a new entry to the bag
	// returns true if the addition is succesful, false if not.
	
	public T remove();
	
	// removes an unspecified entry from the bag
	// returns true if the removal was succesful, null if not.
	
	public boolean remove (T anEntry);
	
	// removes the first occurance of specified entry from the bag
	// returns true if the removal was succesful, false if not.
	
	public void clear();
	
	//removes all entries from the bag.
	
	public int getFrequencyOf(T anEntry);
	
	// returns the numbre of times occurance anEntry in bag.
	
	public boolean contains(T anEntry);
	
	// tests whether the bag contains given entry
	//returns true if the bag contains anEntry, false if not.
	
	public T[] toArray();
	
	//retrieves all entries in the bag
	// returns a newly allocated array of all the entries in the bag.
	 


}
