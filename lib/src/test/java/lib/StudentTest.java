package lib;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	Student stud;
	@BeforeEach
	void setUp() throws Exception {
		stud = new Student();
		stud.setRoll(1001);
		stud.setName("ram kumar");
		stud.setEngMarks(45f);
		stud.setMathMarks(55f);
		stud.setSciMarks(25f);
	}

//	@AfterEach
//	void tearDown() throws Exception {
//	}

	@Test
	void testAvgMarks() {
		assertEquals(125f,stud.AvgMarks());
	}
	
	@Test
	void testTotalMarks() {
		assertEquals(125f,stud.TotalMarks());
	}


}
