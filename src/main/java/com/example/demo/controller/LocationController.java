@Restcontroller
public class LocationController{
    @Autowired
    LocationService locationservice;
    @PostMapping("/addstudent")
    public LocationEntity add()
}