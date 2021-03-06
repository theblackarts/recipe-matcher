package devApp.entity.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import devApp.entity.user.model.WebUser;


@Service
public interface WebUserService extends UserDetailsService {

    /**
     * Load WebUser by its database key.
     * @param key key of the WebUser.
     * @return WebUser of the key, null otherwise.
     */
    WebUser load(Number key);

    /**
     * Load WebUser by its user name.
     * @param userName find this user name.
     * @return WebUser with given user name, null otherwise.
     */
    WebUser findByUserName(String userName);

    /**
     * Merge given WebUser.
     * @param user merge this user.
     * @return merged user.
     */
    WebUser saveOrUpdate(WebUser user);
}
