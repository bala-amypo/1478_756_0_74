@Restcontroller
public class LocationController{
    @Autowired
    LocationService locationservice;
    @PostMapping("/addstudent")
    public LocationEntity add(@RequestBody LocationEntity le){
        return locationservice.createlocation(le)
    }
    @GetMapping("/showlocation")
    public List<LocationEntity> show(){
        return locationservice.getalllocation();
    }
}