package com.newer.medicine.mapper;


import com.newer.medicine.domain.Admins;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsMapper {


    public Admins findByUsername(String username);

    @Select("select * from admins where aname=#{aname} and pwd=#{pwd} and aexist=1")
    public Admins login(@Param("aname") String aname,
                        @Param("pwd") String pwd);

    /**
     * 修改登录时间
     *
     * @param aid
     * @return
     */
    @Update("update admins set login_time=now() where aid = #{aid}")
    int updateLoginTime(@Param("aid") Integer aid);

    /**
     * 修改密码
     *
     * @param aid
     * @param password
     * @return
     */
    @Update("update admins set pwd=#{password} where aid = #{aid}")
    int changePassword(@Param("aid") Integer aid, @Param("password") String password);

}
