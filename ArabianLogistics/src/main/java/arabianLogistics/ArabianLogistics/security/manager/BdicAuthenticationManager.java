package arabianLogistics.ArabianLogistics.security.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class BdicAuthenticationManager implements AuthenticationManager {
    private final AuthenticationProvider authenticationProvider;

    @Autowired
    public BdicAuthenticationManager(AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Class<? extends Authentication> authType = authentication.getClass();
        if (authenticationProvider.supports(authType)) return authenticationProvider.authenticate(authentication);
        throw new ProviderNotFoundException("Authentication provider not found");
    }
}
