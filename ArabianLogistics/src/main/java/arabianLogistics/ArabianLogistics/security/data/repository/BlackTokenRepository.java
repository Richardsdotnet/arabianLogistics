package arabianLogistics.ArabianLogistics.security.data.repository;

import arabianLogistics.ArabianLogistics.security.data.model.BlacklistedToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BlackTokenRepository extends JpaRepository<BlacklistedToken, UUID> {
    Optional<BlacklistedToken> findByToken(String token);
    boolean existsByToken(String token);
}
