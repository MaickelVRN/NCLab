package ru.vsu.lab.repository;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import ru.vsu.lab.entities.IPerson;

public interface IRepository {
	
	public void add(IPerson person);
	
	public IPerson get(int index);
	
	public IPerson delete(int index);

	public IPerson set(int index, IPerson person);
	
	public void add(int index, IPerson person);
	
	public List<IPerson> toList();
	
	public void sortBy(Comparator<IPerson> comparator );
	
	public IRepository searchBy(Predicate<IPerson> condition);
	
}
