package h1;

public enum b
{
    e("activityMissing", 0), 
    f("errorWhileAcquiringPosition", 1), 
    g("locationServicesDisabled", 2), 
    h("permissionDefinitionsNotFound", 3), 
    i("permissionDenied", 4), 
    j("permissionRequestInProgress", 5);
    
    private static final b[] k;
    
    static {
        k = a();
    }
    
    private b(final String s, final int n) {
    }
    
    private static /* synthetic */ b[] a() {
        return new b[] { b.e, b.f, b.g, b.h, b.i, b.j };
    }
    
    public String b() {
        switch (b$a.a[this.ordinal()]) {
            default: {
                throw new IndexOutOfBoundsException();
            }
            case 6: {
                return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
            }
            case 5: {
                return "User denied permissions to access the device's location.";
            }
            case 4: {
                return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
            }
            case 3: {
                return "Location services are disabled. To receive location updates the location services should be enabled.";
            }
            case 2: {
                return "An unexpected error occurred while trying to acquire the device's position.";
            }
            case 1: {
                return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
            }
        }
    }
    
    public String toString() {
        switch (b$a.a[this.ordinal()]) {
            default: {
                throw new IndexOutOfBoundsException();
            }
            case 6: {
                return "PERMISSION_REQUEST_IN_PROGRESS";
            }
            case 5: {
                return "PERMISSION_DENIED";
            }
            case 4: {
                return "PERMISSION_DEFINITIONS_NOT_FOUND";
            }
            case 3: {
                return "LOCATION_SERVICES_DISABLED";
            }
            case 2: {
                return "ERROR_WHILE_ACQUIRING_POSITION";
            }
            case 1: {
                return "ACTIVITY_MISSING";
            }
        }
    }
}
