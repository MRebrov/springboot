package de.springboot.service;

import de.springboot.model.StackOverflowWebsite;
import de.springboot.persistence.StackOverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StackOverflowService {

    @Autowired
    StackOverflowWebsiteRepository repository;

//    private static List<StackOverflowWebsite> items = new ArrayList<>();
//
//    static {
//        items.add(new StackOverflowWebsite("ru.stackoverflow", "http://ru.stackoverflow.com",
//                "http://cdn.sstatic.net/Sites/ru/img/favicon.ico", "Stack Overflow на русском (Stack Exchange)",
//                "для программистов"));
//        items.add(new StackOverflowWebsite("android", "http://android.stackexchange.com",
//                "http://cdn.sstatic.net/Sites/android/img/favicon.ico", "Android Enthusiasts (Stack Exchange)",
//                "for enthusiasts and power users of Android operating system"));
//        items.add(new StackOverflowWebsite("stackoverflow", "http://stackoverflow.com",
//                "http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow (Stack Exchange)",
//                "for professional and enthusiast programmers"));
//        items.add(new StackOverflowWebsite("serverfault", "http://serverfault.com",
//                "http://cdn.sstatic.net/Sites/serverfault/img/favicon.ico", "Server Fault (Stack Exchange)",
//                "for system and network administrators"));
//        items.add(new StackOverflowWebsite("askubuntu", "http://askubuntu.com",
//                "http://cdn.sstatic.net/Sites/askubuntu/img/favicon.ico", "Ask Ubuntu (Stack Exchange)",
//                "for Ubuntu uses and developers"));
//        items.add(new StackOverflowWebsite("superuser", "http://superuser.com",
//                "http://cdn.sstatic.net/Sites/superuser/img/favicon.ico", "Super User (Stack Exchange)",
//                "for computer enthusiasts and power users"));
//        items.add(new StackOverflowWebsite("apple", "http://apple.stackexchange.com",
//                "http://cdn.sstatic.net/Sites/apple/img/favicon.ico", "Ask Different (Stack Exchange)",
//                "for power users of Apple hardware and software"));
//    }

//    @PostConstruct
//    public void init() {
//        repository.saveAll(items);
//    }

    public List<StackOverflowWebsite> findAll() {
        return repository.findAll();
    }
}
