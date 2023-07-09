 import java.util.*;

public class MyHashTable {
	
	// ATTRIBUTES
 
	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<EmployeeInfo>[] buckets;
	public int totalEmployeeCount;
        public int pTEmployeeCount;
        public int fTEmployeeCount;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
		}
		
		totalEmployeeCount = 0;
                pTEmployeeCount = 0;
                fTEmployeeCount = 0;
	}

	
	// METHODS

	public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
	

	public boolean addEmployee(EmployeeInfo theEmployee) {
            // Add the employee to the hash table.  Return true if employee is added successfully,
            // return false otherwise.
		
            if (theEmployee == null) {
                return(false);
            }
                
            else {
                int targetBucket = calcBucket(theEmployee.empNum);
		// Add the employee to the ArrayList for the targetBucket.
		boolean addStatus = buckets[targetBucket].add(theEmployee);
		totalEmployeeCount++;
                
                if (theEmployee instanceof PTE) {
                    pTEmployeeCount++;
                }
                
                else {
                    fTEmployeeCount++;
                }
                
		return addStatus;
            }
		
	} // end addEmployee
		
	
	public EmployeeInfo removeEmployee(int theEmpNum) {
            // Remove this employee from the hash table and return their ref val to the caller.
            // If the employee is not in the hash table, return null to the caller.
            
            EmployeeInfo removedEmployee;
            int targetBucket = calcBucket(theEmpNum);

            for (int i = 0; i < buckets[targetBucket].size(); i++) {
		if (buckets[targetBucket].get(i).empNum == theEmpNum) {
                    removedEmployee = buckets[targetBucket].get(i);
                    buckets[targetBucket].remove(i);
                    
                    if (removedEmployee instanceof PTE) {
                        pTEmployeeCount--;
                    }
                    
                    else {
                        fTEmployeeCount--;
                    }
                    
                    totalEmployeeCount--;
                    return removedEmployee;
		}
            }

	    return null;
            
        } // end removeEmployee
        
        
        public EmployeeInfo getEmployee(int theEmpNum) {
            // Get (but don't remove) this employee from the hash table and return their ref val to the caller.
            // If the employee is not in the hash table, return null to the caller.
            
            int targetBucket = calcBucket(theEmpNum);

            for (int i = 0; i < buckets[targetBucket].size(); i++) {
                if (buckets[targetBucket].get(i).empNum == theEmpNum) {
                    return buckets[targetBucket].get(i);
                }
            }

            return null;            
        } // end getEmployee
        
} // end MyHashTable