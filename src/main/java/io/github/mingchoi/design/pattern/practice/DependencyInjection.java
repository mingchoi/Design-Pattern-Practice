package io.github.mingchoi.design.pattern.practice;

class Service {
    private String URL;

    public Service(String _URL) {
        URL = _URL;
    }

    public String GetURL() {
        return URL;
    }

}

class DependencyInjection {
    private Service service;

    public DependencyInjection(Service _service) {
        service = _service;
    }

    public void Call() {
        System.out.println("Calling " + service.GetURL());
    }

    public static void main(String[] args) {
        Service service = new Service("http://domain.com");
        DependencyInjection di = new DependencyInjection(service);
        di.Call();
        Service service2 = new Service("http://otherdomain.com");
        DependencyInjection di2 = new DependencyInjection(service2);
        di2.Call();
    }
}
