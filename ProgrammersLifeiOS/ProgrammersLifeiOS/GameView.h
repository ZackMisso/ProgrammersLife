//
//  GameView.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Player.h"

@interface GameView : UIView{
    Player *player;
}

-(void)initialize;

// getter methods
-(Player*)getPlayer;

// setter methods
-(void)setPlayer:(Player*)value;

@end