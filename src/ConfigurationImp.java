public class ConfigurationImp implements Configuration {

    private static Configuration configuration = null;

    public static Configuration getConfiguration(){
        if(configuration == null){
            configuration = new ConfigurationImp();
        }
        return configuration;
    }

    @Override
    public String getUser() {
        return System.getenv("DBUser");
    }

    @Override
    public String getPassword() {
        return System.getenv("DBPassword");
    }

    @Override
    public String getUrl() {
        return System.getenv("DBUrl");
    }
    
}
