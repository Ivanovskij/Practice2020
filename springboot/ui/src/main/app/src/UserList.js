import React, {Component} from 'react';
import {Button, Container, Table} from 'reactstrap';
import AppNavbar from './AppNavbar';
import {Link} from 'react-router-dom';

class UserList extends Component {
    constructor(props) {
        super(props);
        this.state = {users: [], isLoading: true};
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('/users?page=1')
            .then(response => response.json())
            .then(data => this.setState({users: data.content, isLoading: false}));
    }


    render() {
        const {users, isLoading} = this.state;

        if (isLoading) {
            return <p>Loading...</p>;
        }

        const userList = users.map(user => {
            return <tr key={user.id}>
                        <td style={{whiteSpace: 'nowrap'}}>{user.profile.name}</td>
                    </tr>
        });

        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/users/new">Add User</Button>
                    </div>
                    <h3>Users</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="20%">Name</th>
                        </tr>
                        </thead>
                        <tbody>
                        {userList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default UserList;