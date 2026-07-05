package SmartGym_ERP.repository;

import SmartGym_ERP.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Spring Boot විසින් අපිට අවශ්‍ය සියලුම CRUD (Save, Update, Delete, Find) වැඩ ටික මේක හරහා auto ම හදලා දෙනවා.
}