package lambda02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional2 {

    public static void main(String[] args) {
        UserRepository userRepo=new UserRepository();
        User user=userRepo.findById(5L);
        System.out.println(user);
    }

}

class UserRepository{

    List<User> userList=new ArrayList<>();

    public UserRepository() {
        userList.add(new User(1L,"343-34-2344"));
        userList.add(new User(2L,"673-34-2344"));
        userList.add(new User(3L,"883-34-2344"));

    }

    public User findById(Long id) {
        Optional<User> optUser = userList.stream().filter(user->user.getId()==id).findFirst();
        return optUser.orElseThrow(()->new NotFoundException("User not found"));
    }

}

class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}

class User{

    private Long id;
    private String ssn;
    public User(Long id, String ssn) {
        super();
        this.id = id;
        this.ssn = ssn;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", ssn=" + ssn + "]";
    }
}
