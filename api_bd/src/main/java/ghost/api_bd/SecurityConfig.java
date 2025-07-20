package ghost.api_bd;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            .csrf(csrf -> csrf.disable()) // necessário pro console funcionar
            .headers(headers -> headers.frameOptions().disable()); // necessário pro console abrir no navegador

        return http.build();
    }
}
