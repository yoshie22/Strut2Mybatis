package pkg.mybatis;

import org.apache.ibatis.annotations.Select;




public interface EmployeeMapper {
	@Select("SELECT * FROM Employee where Employee_Id = #{id}")
	Employee select(int id);
}
