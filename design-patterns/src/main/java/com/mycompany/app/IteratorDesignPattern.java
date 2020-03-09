package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;
interface Iterator
{
	String getNext();
	boolean hasMore();
}
interface IterableCollection
{
	Iterator createIterator();
}
public class IteratorDesignPattern implements IterableCollection
{
	List<String> internalList=new ArrayList<>();
	public Iterator createIterator()
	{
		return new CustomIterableCollectionIterator(this);
	}
	public IteratorDesignPattern()
	{
		internalList.add("Iterator");
		internalList.add("Design");
		internalList.add("Pattern");
	}
	public int size()
	{
		return this.internalList.size();
	}
	public String getStringAtIndex(int i)
	{
		return internalList.get(i);
	}
}
class CustomIterableCollectionIterator implements Iterator
{
	private IteratorDesignPattern collection;
	private int collectionSize;
	private int currentIndex=-1;
	public CustomIterableCollectionIterator(IteratorDesignPattern collection)
	{
		this.collection=collection;
		this.collectionSize=collection.size();
	}
	public String getNext()
	{
		currentIndex++;
		return this.collection.getStringAtIndex(currentIndex);
	}
	public boolean hasMore()
	{
		return currentIndex+1<collectionSize;
	}
}