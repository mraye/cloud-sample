package com.github.vspro.cloudgatewayitd;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CloudGatewayItdApplicationTests {


    @LocalServerPort
    int port;


    private WebTestClient client;

    @Before
    public void setUp(){

        client = WebTestClient.bindToServer().baseUrl("http://localhost:"+ port).build();
    }


    @Test
    public void pathRouteWorks(){

        client.get().uri("/blogs")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .consumeWith(result -> {
                    assertThat(result.getResponseBody()).isNotEmpty();
                });
    }

}
