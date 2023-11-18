package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:resources/user.properties"
})
public interface UserConfig extends Config {
    @Key("userName")
    String getUserName();

    @Key("userPassword")
    String getUserPassword();

    @Key("remoteUrl")
    String getRemoteUrl();
}
