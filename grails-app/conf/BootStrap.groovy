import uk.ac.shu.webarch.eregister.*
class BootStrap {

    def init = { servletContext ->

println("Bootstrap::init");


def Ryan_instructor = Instructor.findByStaffNumber('100'); 

if ( Ryan_instructor == null ) {
println ("Instructor not found, create...");
Ryan_instructor = new Instructor()
Ryan_instructor.staffNumber = '100';
Ryan_instructor.name = 'RyanSlater';
Ryan_instructor.save();

def web_arch_course = Course.findByCourseCode('1A') ?: new Course(courseCode:'1A1', 
                                                                  courseName:'Web Architectures', 
                                                                  description:'Headache for students').save(); 

}
else {


println("Result of find Staff Number for Ryan: ${Ryan_instructor}");
}


    }
    def destroy = {
    }
}
