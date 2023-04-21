package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper05 {

	@Update("""
			UPDATE MyTable39
			SET
				Col2 = '수정된 값',
				Col3 = 99999
			""")
	int sql1();
	
	@Update("""
			UPDATE MyTable39
			SET
				Col2 = #{val1},
				Col3 = #{val2}
			WHERE
				Col1 = #{key}
			""")
	int sql2(Integer key, String val1, Integer val2);
	
	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{name},
				Country = #{country}
			WHERE	
				CustomerID = #{id}
			""")
	int sql3(Integer id, String name, String country);

	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{name},
				ContactName = #{contactName},
				Address = #{address},
				City = #{city},
				PostalCode = #{postalCode},
				Country = #{country}
			WHERE
				CustomerID = #{id}
			""")
	int sql4(Customer customer);

	@Select("""
			SELECT 
				CustomerID id,
				CustomerName name,
				ContactName,
				Address,
				City,
				Country,
				PostalCode
			FROM Customers
			WHERE CustomerID = #{id}	
			""")
	Customer sql5(Integer id);
	
	@Update("""
			UPDATE Employees
			SET
				FirstName = #{firstName},
				LastName = #{lastName},
				BirthDate = #{birth},
				Photo = #{photo},
				Notes = #{notes}
			WHERE
				EmployeeID = #{employeeId}
			""")
	int sql6(Employees employee);
	
	@Select("""
			SELECT 
				EmployeeID,
				FirstName,
				LastName,
				BirthDate Birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeID = #{id}	
			""")
	Employees sql7(Integer id);
	
}



















