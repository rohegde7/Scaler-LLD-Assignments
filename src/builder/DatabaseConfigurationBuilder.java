package builder;


public class DatabaseConfigurationBuilder {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;
    public static DatabaseConfigurationBuilder.Builder getBuilder() {
        return new DatabaseConfigurationBuilder.Builder();
    }

    public DatabaseConfigurationBuilder(DatabaseConfigurationBuilder.Builder builder) {
        this.databaseUrl = builder.getDatabaseUrl();
        this.username = builder.getUsername();
        this.password = builder.getPassword();
        this.maxConnections = builder.getMaxConnections();
        this.enableCache = builder.isEnableCache();
        this.isReadOnly = builder.isReadOnly();
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public DatabaseConfigurationBuilder setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public DatabaseConfigurationBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public DatabaseConfigurationBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public DatabaseConfigurationBuilder setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public DatabaseConfigurationBuilder setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
        return this;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public DatabaseConfigurationBuilder setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
        return this;
    }


    public static class Builder {

        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public String getDatabaseUrl() {
            return databaseUrl;
        }

        public Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public Builder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public Builder setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public Builder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }


        public DatabaseConfigurationBuilder build() {
            return new DatabaseConfigurationBuilder(this);
        }

    }
}
