package com.assignment.question;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    // Singleton instance
    private static FileBasedConfigurationManagerImpl fbcm1 = null;

    // Private constructor to prevent instantiation from outside
    private FileBasedConfigurationManagerImpl(){
        super();
    }

    // Returns the singleton instance of the configuration manager
    public static FileBasedConfigurationManager getInstance() {
        // Check if instance is null before creating a new one
        if(fbcm1 == null){
            // Synchronize to ensure thread safety

            /**
            .class is used to obtain the Class object associated with a particular class. 

            The Class object represents metadata about the class, 
            such as its methods, fields, constructors, and annotations.

            In the Singleton pattern implementation,
            synchronized(FileBasedConfigurationManagerImpl.class) { } is using the Class object 
            as a lock for synchronization to ensure thread safety
            during the creation of the singleton instance.
            
            */

            synchronized(FileBasedConfigurationManagerImpl.class){

                // Double-check null instance before creating
                if(fbcm1 == null){
                    fbcm1 = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return fbcm1;
    }

    // Resets the singleton instance (for testing purposes)
    public static void resetInstance() {
        fbcm1 = null;
    }

    // Retrieves configuration value for the given key
    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    // Retrieves configuration value for the given key with specified type
    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = properties.getProperty(key);
        if(value != null){
            return convert(value, type);
        }
        return null;
    }

    // Sets configuration value for the given key
    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    // Sets configuration value for the given key with specified type
    @Override
    public <T> void setConfiguration(String key, T value) {
        if(value != null){
            properties.setProperty(key, value.toString());
        }
        else{
            removeConfiguration(key);
        }
    }

    // Removes configuration value for the given key
    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    // Clears all configurations
    @Override
    public void clear() {
        properties.clear();
    }
}