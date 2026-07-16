import React from "react";
import Post from "./Post";

class Posts extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                this.setState({
                    posts: data
                });
            })
            .catch(error => {
                alert(error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(error);
        console.log(info);
    }

    render() {
        return (
            <div>
                <h1 style={{ textAlign: "center" }}>Blog Posts</h1>

                {this.state.posts.map(post => (
                    <div
                        key={post.id}
                        style={{
                            textAlign: "center",
                            padding: "20px",
                            borderBottom: "1px solid lightgray"
                        }}
                    >
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;