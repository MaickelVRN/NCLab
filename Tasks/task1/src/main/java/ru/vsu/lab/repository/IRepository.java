package ru.vsu.lab.repository;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import ru.vsu.lab.entities.IPerson;

/**
 * Generic repository
 * If currently you don't know how to work with generic use {@link IPersonRepository}
 *
 * 
 */
public interface IRepository<T> {
	
	public void add(T person);
	
	public T get(int index);
	
	public T delete(int index);

	public T set(int index, T person);
	
	public void add(int index, T person);
	
	public List<T> toList();
	
	//Should not use toList method
	public void sortBy(Comparator<T> comparator );
	
	//Should not use toList method
	public IRepository<T> searchBy(Predicate<T> condition);
	
}
