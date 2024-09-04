package com.example.demo.MyRepo;
import org.springframework.data.jpa.repository.*;
import com.example.demo.Model.*;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
