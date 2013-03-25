println "Starting"

Planet p1 = new Planet()
Planet p2 = new Planet()
Planet p3 = new Planet()

Planet.shape = "Circle"

p1.name="earth"
//p1.shape="circle"
p2.name="jupiter"
//p2.shape="circle"
p3.name="mars"
//p3.shape="circle"

println  p1.name + " " + p1.shape
println  p2.name + " " + p2.shape
println  p3.name + " " + p3.shape


class Planet{
    // Variables and functions

    def name // Non-static variable
    def static shape // static variable
}
