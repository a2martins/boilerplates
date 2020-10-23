import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Grid from '@material-ui/core/Grid';
import Hidden from '@material-ui/core/Hidden';
import { makeStyles } from '@material-ui/core/styles';
import Typography from '@material-ui/core/Typography';
import PropTypes from 'prop-types';
import React from 'react';

const useStyles = makeStyles({
  card: {
    display: 'flex',
  },
  cardDetails: {
    flex: 1,
  },
  cardMedia: {
    width: 160,
  },
});

const Post = (props: any) => {
  const classes = useStyles();
  const { user } = props;

  return (
    <Grid item xs={12} md={6}>
      <CardActionArea component="a" href="#">
        <Card className={classes.card}>
          <div className={classes.cardDetails}>
            <CardContent>
              <Typography component="h2" variant="h5">
                {user.name}
              </Typography>
              <Typography variant="subtitle1" color="textSecondary">
                {user.created_at}
              </Typography>
              <Typography variant="subtitle1" paragraph>
                {user.bio}
              </Typography>
              <Typography variant="subtitle1" color="primary">
                {user.html_url}
              </Typography>
            </CardContent>
          </div>
          <Hidden xsDown>
            <CardMedia className={classes.cardMedia} image={"https://avatars0.githubusercontent.com/u/8130295?v=4"} title={user.login} />
          </Hidden>
        </Card>
      </CardActionArea>
    </Grid>
  );
}

Post.propTypes = {
  user: PropTypes.object,
};

export default Post
