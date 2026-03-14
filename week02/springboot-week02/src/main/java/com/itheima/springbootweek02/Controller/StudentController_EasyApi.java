package com.itheima.springbootweek02.Controller;

import com.itheima.springbootweek02.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Students")
public class StudentController_EasyApi {

   // 在body一栏的用法
   @RequestMapping ()
    public String creatStudent(@RequestBody Student student){
        System.out.println("接受到学生对象参数"+student);
        return "创建学生成功"+student;
    }

    // 在path一栏的用法 不能传对象
/*    @RequestMapping ("/{name}")
    public String creatStudent(@PathVariable String name){
        System.out.println("接受到学生对象参数"+name);
        return "创建学生成功"+name;
    }*/


    //在query一栏的用法静态传参
    /*@RequestMapping
    public String creatStudent( Sting name)
        return "创建学生成功"+name;

    }*/

}
