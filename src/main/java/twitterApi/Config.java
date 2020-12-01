package twitterApi;
import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
@Configuration
@EnableCaching
public class Config implements CachingConfigurer {
    @Bean
    @Override
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        GuavaCache guavaCache = new GuavaCache("timelineInfo", CacheBuilder.newBuilder()
                .expireAfterWrite(2, TimeUnit.MINUTES)
                .build());
        cacheManager.setCaches(Arrays.asList(guavaCache));
        return cacheManager;
    }
    @Override
    public CacheResolver cacheResolver() {
        return null;
    }
    @Override
    public KeyGenerator keyGenerator() {
        return new SimpleKeyGenerator();
    }
    @Override
    public CacheErrorHandler errorHandler() {
        return null;
    }
}
