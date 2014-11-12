package pkg.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbMain {
	List<Employee> employeeList;
	  EmployeeMapper mapper;
	  Employee em=new Employee();
	  SqlSession session;

public  DbMain() throws IOException  {


	  String resource = "/mybatis-config.xml";
	  InputStream inputStream = Resources.getResourceAsStream(resource);
	  SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	  session = sqlSessionFactory.openSession();
}
	public List<Employee> selectAll(){

		  try {
			  employeeList=session.selectList("pkg.mybatis.employee-mapper.selectAll");
			 //mapper = session.getMapper(EmployeeMapper.class);
			 //emp=mapper.select(id);
			  return employeeList;
		  }catch(Exception e){
			  System.err.println(e.getMessage());
			  return employeeList;
		  } finally {
		    session.close();
		  }

	  }
	public Employee selectOne(int id){

		  try {
			  em=session.selectOne("pkg.mybatis.employee-mapper.selectOne",id);
			  return em;
		  }catch(Exception e){
			  System.err.println(e.getMessage());
			  return em;
		  } finally {
		    session.close();
		  }

	  }
	public Employee insert(String name,int departmentId){
		  try {
			  employeeList=session.selectList("pkg.mybatis.employee-mapper.selectAll");

			  //登録されている情報の末尾のオブジェクトを取得
			  em=employeeList.get(employeeList.size() - 1);
			  //社員IDは最後の要素のID+100を自動設定
			  em.setEmployee_Id(em.getEmployee_Id()+100);
			  em.setEmployee_Name(name);
			  em.setDepartment_Id(departmentId);

			  session.insert("pkg.mybatis.employee-mapper.insert",em);
			  session.commit();

			  return em;
		  }catch(Exception e){
			  System.err.println(e.getMessage());
			  return em;
		  } finally {
		    session.close();
		  }

	  }
	public Employee update(int id, String name,int departmentId){
		  try {
			  em.setEmployee_Id(id);
			  em.setEmployee_Name(name);
			  em.setDepartment_Id(departmentId);
			  session.update("pkg.mybatis.employee-mapper.update",em);
			  //更新結果を検索
			  em=session.selectOne("pkg.mybatis.employee-mapper.selectOne",id);
			  session.commit();

			  return em;
		  }catch(Exception e){
			  System.err.println(e.getMessage());
			  return em;
		  } finally {
		    session.close();
		  }

	  }
	public Employee delete(int id){
		  try {
			  //削除対象のデータを検索
			  em=session.selectOne("pkg.mybatis.employee-mapper.selectOne",id);
			  session.delete("pkg.mybatis.employee-mapper.delete",id);

			  session.commit();

			  return em;
		  }catch(Exception e){
			  System.err.println(e.getMessage());
			  return em;
		  } finally {
		    session.close();
		  }

	  }
}