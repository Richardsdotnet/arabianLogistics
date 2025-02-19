package arabianLogistics.ArabianLogistics.security.service;

public interface AuthService {
    void blacklist(String token);
    boolean isTokenBlacklisted(String token);

}